import org.warcbase.spark.matchbox.{ExtractDomain, ExtractLinks, RecordLoader, WriteGDF}
import org.warcbase.spark.rdd.RecordRDD._

val links = RecordLoader.loadArchives("/mnt/vol1/data_sets/elxn42/warcs/*.gz", sc)
  .keepValidPages()
  .map(r => (r.getCrawlDate, ExtractLinks(r.getUrl, r.getContentString)))
  .flatMap(r => r._2.map(f => (r._1, ExtractDomain(f._1).replaceAll("^\\s*www\\.", ""), ExtractDomain(f._2).replaceAll("^\\s*www\\.", ""))))
  .filter(r => r._2 != "" && r._3 != "")
  .countItems()
  .filter(r => r._2 > 5)

WriteGDF(links, "/home/i2millig/McLuhan/Networks/elxn42-links-201601.gdf")
