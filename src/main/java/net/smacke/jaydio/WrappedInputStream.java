package net.smacke.jaydio;

import java.io.IOException;
import java.io.InputStream;

public class WrappedInputStream extends InputStream{
  private DirectRandomAccessFile file;
  
  public WrappedInputStream(DirectRandomAccessFile file) {
    this.file = file;
  }
  
  public int read() throws IOException {
    return this.file.read();
  }
  
  public int read(byte[] dst) throws IOException {
    return this.file.read(dst);
  }

  public int read(byte[] dst, int offset, int length) throws IOException {
    return this.file.read(dst, offset, length);
  }

  public void close() throws IOException {
    this.file.close();
  }
}
