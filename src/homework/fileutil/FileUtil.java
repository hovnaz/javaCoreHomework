package homework.fileutil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    private static String path = "/home/hovnaz/Рабочий стол/javaCoreHomework/src/homework/fileutil/node";

    public static void main(String[] args) {
//        LinkedList<String> strings = contentSearch("/home/hovnaz/Рабочий стол/javaCoreHomework/src/homework/fileutil/node", "barev java");
//        System.out.println(strings);
//        printSizeOfPackage(path);
        findLines("/home/hovnaz/Рабочий стол/javaCoreHomework/src/homework/fileutil/node/1/4/5/barev.txt", "barev haystan");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch(String path, String fileName) {
        File file = new File(path, fileName);
        System.out.println(file.isFile());
    }

    static String fileSearchRecursive(String path, String fileName) {
        File file = new File(path);
        String[] listDir = file.list();
        LinkedList<String> list = new LinkedList<>();
        assert listDir != null;
        for (String s : listDir) {
            String newPath = path + File.separator + s;
            File f = new File(newPath);
            if (f.isDirectory()) {
                String strings = fileSearchRecursive(newPath, fileName);
                if (Objects.requireNonNull(f.list()).length >= 1) {
                    list.add(strings);
                }
            } else {
                if (f.getName().endsWith(fileName) || fileName.equals("*")) {
                    list.add(f.getPath());
                }
            }
        }
        return String.join(", ", list);
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static LinkedList<String> contentSearch(String path, String keyword) {
        LinkedList<String> res = new LinkedList<>();
        String[] s = fileSearchRecursive(path, ".txt").split(", ");
        labelFor:
        for (String pathName : s) {
            try {
                BufferedReader buffer = new BufferedReader(new FileReader(pathName));
                String line;
                while ((line = buffer.readLine()) != null) {
                    if (line.trim().contains(keyword)) {
                        res.add(pathName);
                        continue labelFor;
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return res;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String txtPath, String keyword) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(txtPath));
            String line;
            while ((line = buffer.readLine()) != null) {
                if (line.trim().contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static long printSizeOfPackage(String path) {
        long bytes = 0;
        String[] listFilespath = fileSearchRecursive(path, "*").split(", ");
        for (String filePath : listFilespath) {
            try {
                bytes += Files.size(Path.of(filePath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(bytes);
        return bytes;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String path, String fileName, String content) {
        File f = new File(path, fileName);
        if (f.canExecute()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
                writer.write(content);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
