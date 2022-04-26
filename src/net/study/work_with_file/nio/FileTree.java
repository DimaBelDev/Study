package net.study.work_with_file.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Anonymous\\Desktop\\X");

        Files.walkFileTree(path, new MyFileVisitor());

    }
}

class MyFileVisitor implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entry to directory " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            System.out.println("Error while visiting file " + file.getFileName());

        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("exit from directory " + dir);
        return FileVisitResult.CONTINUE;
    }
}