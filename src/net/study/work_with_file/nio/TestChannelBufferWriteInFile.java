package net.study.work_with_file.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;


public class TestChannelBufferWriteInFile {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test9.txt", "rw");
             FileChannel fileChannel = file.getChannel();){

            String text = "\nTwo roads diverged in a yellow wood," +
                    "And sorry I could not travel both" +
                    "And be one traveler, long I stood" +
                    "And looked down one as far as I could" +
                    "To where it bent in the undergrowth.";

            file.seek(file.length());

            // способ 1
//            ByteBuffer buffer  = ByteBuffer.wrap(text.getBytes());
//            fileChannel.write(buffer);
            // способ 2
//            ByteBuffer buffer = ByteBuffer.allocate(text.getBytes().length);
//            buffer.put(text.getBytes());
//            buffer.flip();
//            fileChannel.write(buffer);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
