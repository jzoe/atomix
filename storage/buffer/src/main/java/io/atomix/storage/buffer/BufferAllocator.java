/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.storage.buffer;

/**
 * Buffer allocator.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public interface BufferAllocator {

  /**
   * Allocates a dynamic capacity buffer.
   *
   * @return The allocated buffer.
   */
  Buffer allocate();

  /**
   * Allocates a dynamic capacity buffer with the given initial capacity.
   *
   * @param initialCapacity The initial buffer capacity.
   * @return The allocated buffer.
   */
  Buffer allocate(int initialCapacity);

  /**
   * Allocates a new buffer.
   *
   * @param initialCapacity The initial buffer capacity.
   * @param maxCapacity     The maximum buffer capacity.
   * @return The allocated buffer.
   */
  Buffer allocate(int initialCapacity, int maxCapacity);

}
