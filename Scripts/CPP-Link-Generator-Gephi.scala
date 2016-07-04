import org.warcbase.spark.matchbox.{ExtractDomain, ExtractLinks, RecordLoader, WriteGDF}
import org.warcbase.spark.rdd.RecordRDD._

val links = RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201508*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, ExtractLinks(r.getUrl, r.getContentString)))
  .flatMap(r => r._2.map(f => (r._1, ExtractDomain(f._1).replaceAll("^\\s*www\\.", ""), ExtractDomain(f._2).replaceAll("^\\s*www\\.", ""))))
  .filter(r => r._2 != "" && r._3 != "")
  .countItems()
  .filter(r => r._2 > 5)

WriteGDF(links, "/home/i2millig/McLuhan/Networks/cpp-links-201508")

val links2 = RecordLoader.loadArchives("/mnt/vol1/data_sets/cpp/cpp_warcs_accession_02/*201511*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, ExtractLinks(r.getUrl, r.getContentString)))
  .flatMap(r => r._2.map(f => (r._1, ExtractDomain(f._1).replaceAll("^\\s*www\\.", ""), ExtractDomain(f._2).replaceAll("^\\s*www\\.", ""))))
  .filter(r => r._2 != "" && r._3 != "")
  .countItems()
  .filter(r => r._2 > 5)

WriteGDF(links2, "/home/i2millig/McLuhan/Networks/cpp-links-201511")

