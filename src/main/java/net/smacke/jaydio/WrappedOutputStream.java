package net.smacke.jaydio;

import java.io.IOException;
import java.io.OutputStream;

public class WrappedOutputStream extends OutputStream {
  private DirectRandomAccessFile file;
  
  public WrappedOutputStream(DirectRandomAccessFile file) {
    this.file = file;
  }
  
  @Override
  public void write(int b) throws IOException {
    this.file.write(b);
  }
  
  @Override 
  public void write(byte[] b) throws IOException {
    this.file.write(b);
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    this.file.write(b, off, len);
  }
}
