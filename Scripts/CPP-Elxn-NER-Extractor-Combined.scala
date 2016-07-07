import org.warcbase.spark.matchbox.NERCombinedJson

sc.addFile("/home/i2millig/warcbase-resources/NER/english.all.3class.distsim.crf.ser.gz")

val ner = new NERCombinedJson

ner.classify("/home/i2millig/warcbase-resources/NER/english.all.3class.distsim.crf.ser.gz", "/mnt/vol1/derivative_data/mcluhan/cpp-elxn-all-text.txt", "/mnt/vol1/derivative_data/mcluhan/ner/cpp-elxn-all-text-combined-ner.json", sc)