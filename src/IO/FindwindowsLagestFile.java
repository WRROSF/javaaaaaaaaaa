package IO;

import java.io.File;

 class FileSizeFinder {
    public static void main(String[] args) {
        File directory = new File("C:/WINDOWS");
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("目录为空或者不是一个目录");
            return;
        }

        File largestFile = null;
        File smallestFile = null;
        long largestSize = 0;
        long smallestSize = Long.MAX_VALUE;

        for (File file : files) {
            if (file.isFile()) {
                long fileSize = file.length();
                if (fileSize > largestSize) {
                    largestSize = fileSize;
                    largestFile = file;
                }
                if (fileSize < smallestSize && fileSize > 0) {
                    smallestSize = fileSize;
                    smallestFile = file;
                }
            }
        }

        if (largestFile != null) {
            System.out.println("最大的文件是：" + largestFile.getName() + "，大小为：" + largestSize + "字节");
        } else {
            System.out.println("没有找到最大的文件。");
        }

        if (smallestFile != null) {
            System.out.println("最小的文件是：" + smallestFile.getName() + "，大小为：" + smallestSize + "字节");
        } else {
            System.out.println("没有找到最小的文件。");
        }
    }
}

