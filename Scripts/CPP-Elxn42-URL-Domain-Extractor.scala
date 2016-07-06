import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._

/** CPP **/

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201508*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, r.getUrl))
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-urls-201508")

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201508*.gz", sc)
  .keepValidPages() 
  .map(r => (r.getCrawlDate, ExtractDomain(r.getUrl)))
  .countItems() 
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-counted-domains-201508")

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201511*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, r.getUrl))
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-urls-201511")

RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201511*.gz", sc)
  .keepValidPages() 
  .map(r => (r. getCrawlDate, ExtractDomain(r.getUrl)))
  .countItems() 
  .saveAsTextFile("/mnt/vol1/derivative_data/cpp-counted-domains-201511")

/** ELXN42 **/

RecordLoader.loadArchives("/mnt/vol1/data_sets/elxn42/warcs/*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, r.getUrl))
  .saveAsTextFile("/mnt/vol1/derivative_data/elxn42-urls-201601")

RecordLoader.loadArchives("/mnt/vol1/data_sets/elxn42/warcs/*.gz", sc)
  .keepValidPages() 
  .map(r => (r.getCrawlDate, ExtractDomain(r.getUrl)))
  .countItems() 
  .saveAsTextFile("/mnt/vol1/derivative_data/elxn42-counted-domains-201601")