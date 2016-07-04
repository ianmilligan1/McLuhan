import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.{RemoveHTML, RecordLoader}

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201508*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, r.getDomain, r.getUrl, RemoveHTML(r.getContentString)))
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-fulltext-201508")

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201511*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, r.getDomain, r.getUrl, RemoveHTML(r.getContentString)))
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-fulltext-201511")
