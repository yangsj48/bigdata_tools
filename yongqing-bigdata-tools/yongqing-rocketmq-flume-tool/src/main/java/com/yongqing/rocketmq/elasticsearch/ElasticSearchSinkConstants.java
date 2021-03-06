/*
 *
 */
package com.yongqing.rocketmq.elasticsearch;

public class ElasticSearchSinkConstants {

  /**
   * Comma separated list of hostname:port, if the port is not present the
   * default port '9300' will be used</p>
   * Example:
   * <pre>
   *  127.0.0.1:92001,127.0.0.2:9300
   * </pre>
   */
  public static final String HOSTNAMES = "hostNames";

  /**
   * The name to index the document to, defaults to 'flume'</p>
   * The current date in the format 'yyyy-MM-dd' will be appended to this name,
   * for example 'foo' will result in a daily index of 'foo-yyyy-MM-dd'
   */
  public static final String INDEX_NAME = "indexName";

  /**
   * The type to index the document to, defaults to 'log'
   */
  public static final String INDEX_TYPE = "indexType";

  /**
   * Name of the ElasticSearch cluster to connect to
   */
  public static final String CLUSTER_NAME = "clusterName";

  /**
   * Maximum number of events the sink should take from the channel per
   * transaction, if available. Defaults to 100
   */
  public static final String BATCH_SIZE = "batchSize";

  /**
   * TTL in days, when set will cause the expired documents to be deleted
   * automatically, if not set documents will never be automatically deleted
   */
  public static final String TTL = "ttl";

  /**
   * The fully qualified class name of the serializer the sink should use.
   */
  public static final String SERIALIZER = "serializer";

  /**
   * Configuration to pass to the serializer.
   */
  public static final String SERIALIZER_PREFIX = SERIALIZER + ".";

  /**
   * The fully qualified class name of the index name builder the sink
   * should use to determine name of index where the event should be sent.
   */
  public static final String INDEX_NAME_BUILDER = "indexNameBuilder";

  /**
   * The fully qualified class name of the index name builder the sink
   * should use to determine name of index where the event should be sent.
   */
  public static final String INDEX_NAME_BUILDER_PREFIX
          = INDEX_NAME_BUILDER + ".";

  /**
   * The client type used for sending bulks to ElasticSearch
   */
  public static final String CLIENT_TYPE = "client";

  /**
   * The client prefix to extract the configuration that will be passed to
   * elasticsearch client.
   */
  public static final String CLIENT_PREFIX = CLIENT_TYPE + ".";

  /**
   * DEFAULTS USED BY THE SINK
   */

  public static final int DEFAULT_PORT = 9300;
  public static final int DEFAULT_TTL = -1;
  public static final String DEFAULT_INDEX_NAME = "flume";
  public static final String DEFAULT_INDEX_TYPE = "log";
  public static final String DEFAULT_CLUSTER_NAME = "elasticsearch";
  public static final String DEFAULT_CLIENT_TYPE = "rest";
  public static final String TTL_REGEX = "^(\\d+)(\\D*)";
  public static final String DEFAULT_SERIALIZER_CLASS = "com.yongqing.rocketmq.elasticsearch.ElasticSearchRocketMqEventSerializer";
  public static final String DEFAULT_INDEX_NAME_BUILDER_CLASS =
          "com.yongqing.rocketmq.elasticsearch.DefaultIndexNameBuilder";
}
