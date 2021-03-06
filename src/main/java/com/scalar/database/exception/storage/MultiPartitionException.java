package com.scalar.database.exception.storage;

public class MultiPartitionException extends InvalidUsageException {

  public MultiPartitionException(String message) {
    super(message);
  }

  public MultiPartitionException(String message, Throwable cause) {
    super(message, cause);
  }
}
