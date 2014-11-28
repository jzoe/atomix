/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.kuujo.copycat.spi;

import net.kuujo.copycat.log.Entry;

/**
 * Cluster partitioner.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public interface Partitioner<T> {

  /**
   * Returns the index of a partition for the given entry.
   *
   * @param entry The entry to partition.
   * @param numPartitions The number of partitions.
   * @return The index of the partition for the given entry.
   */
  int partition(T entry, int numPartitions);

}