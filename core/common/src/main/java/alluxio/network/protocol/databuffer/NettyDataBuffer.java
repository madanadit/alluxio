/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.network.protocol.databuffer;

import alluxio.conf.PropertyKey;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * A DataBuffer with the underlying data being a {@link ByteBuf}.
 */
public final class NettyDataBuffer implements DataBuffer {
  private static final Logger LOG = LoggerFactory.getLogger(NettyDataBuffer.class);
  private final ByteBuf mNettyBuf;

  /**
   * Constructor for creating a NettyDataBuffer, by passing a Netty ByteBuf.
   *
   * @param bytebuf The ByteBuf having the data
   */
  public NettyDataBuffer(ByteBuf bytebuf) {
    Preconditions.checkNotNull(bytebuf, "bytebuf");
    mNettyBuf = bytebuf;
  }

  /**
   * @return the netty buffer
   */
  @Override
  public Object getNettyOutput() {
    LOG.info("Get netty output");
    return mNettyBuf;
  }

  @Override
  public long getLength() {
    LOG.info("Get length {}", mNettyBuf.readableBytes());
    return mNettyBuf.readableBytes();
  }

  @Override
  public ByteBuffer getReadOnlyByteBuffer() {
    LOG.info("Get readonly byte buffer");
    ByteBuffer buffer = mNettyBuf.nioBuffer().asReadOnlyBuffer();
    LOG.info("set readonly byte buffer position");
    buffer.position(0);
    LOG.info("set readonly byte buffer position to zero");
    return buffer;
  }

  @Override
  public void readBytes(byte[] dst, int dstIndex, int length) {
    LOG.info("Get read bytes");
    mNettyBuf.readBytes(dst, dstIndex, length);
  }

  @Override
  public void readBytes(OutputStream outputStream, int length) throws IOException {
    LOG.info("Get read bytes 2");
    mNettyBuf.readBytes(outputStream, length);
  }

  @Override
  public void readBytes(ByteBuffer outputBuf) {
    LOG.info("Get read bytes 3");
    mNettyBuf.readBytes(outputBuf);
  }

  @Override
  public int readableBytes() {
    LOG.info("Get read bytes 4");
    return mNettyBuf.readableBytes();
  }

  /**
   * Release the Netty ByteBuf.
   */
  @Override
  public void release() {
    LOG.info("release buffer");
    mNettyBuf.release();
    LOG.info("released buffer");
  }
}
