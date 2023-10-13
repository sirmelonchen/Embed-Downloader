package de.sirmelonchen;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
public class Downloader {
    public static void main() throws IOException {

    }
    private static void delurl() throws IOException {
        Main.delConfig("URL");
    }
}
