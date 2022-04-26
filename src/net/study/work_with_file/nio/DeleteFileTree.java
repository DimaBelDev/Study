package net.study.work_with_file.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {
    public static void main(String[] args) throws IOException {
        Path deleteDir = Paths.get("C:\\Users\\Anonymous\\Desktop\\CopyDir");

        Files.walkFileTree(deleteDir, new MyFileVisitor3());

    }
}
class MyFileVisitor3  extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}