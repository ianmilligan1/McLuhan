import org.warcbase.spark.matchbox.NERCombinedJson

sc.addFile("/home/i2millig/warcbase-resources/NER/english.all.3class.distsim.crf.ser.gz")

val ner = new NERCombinedJson

ner.classify("english.all.3class.distsim.crf.ser.gz", "/mnt/vol1/derivative_data/cpp-fulltext-201508/cpp-fulltext-201508.txt", "/mnt/vol1/derivative_data/mcluhan/ner/cpp-fulltext-201508-results.json", sc)

val ner2 = new NERCombinedJson

ner2.classify("english.all.3class.distsim.crf.ser.gz", "/mnt/vol1/derivative_data/cpp-fulltext-201511/cpp-fulltext-201511.txt", "/mnt/vol1/derivative_data/mcluhan/ner/cpp-fulltext-201511-results.json", sc)

val ner3 = new NERCombinedJson

ner3.classify("english.all.3class.distsim.crf.ser.gz", "/mnt/vol1/derivative_data/elxn42-fulltext/elxn42-fulltext-201601.txt", "/mnt/vol1/derivative_data/mcluhan/ner/elxn42-fulltext-201601-results.json", sc)
