# CPP 201508

stanford-ner/ner.sh cpp-fulltext-201508.txt > cpp-fulltext-201508-ner.txt
sed 's/\/O / /g' < cpp-fulltext-201508-ner.txt > cpp-fulltext-201508-ner_clean.txt
    
# extracting persons and counting them
egrep -o -f personpattr cpp-fulltext-201508-ner_clean.txt > cpp-fulltext-201508_ner_pers.txt
cat cpp-fulltext-201508_ner_pers.txt | sed 's/\/PERSON//g' | sort | uniq -c | sort -nr > cpp-fulltext-201508_ner_pers_freq.txt
    
# extracting organizations and counting them
egrep -o -f orgpattr cpp-fulltext-201508-ner_clean.txt > cpp-fulltext-201508-ner_org.txt
cat cpp-fulltext-201508-ner_org.txt | sed 's/\/ORGANIZATION//g' | sort | uniq -c | sort -nr > cpp-fulltext-201508-ner_org_freq.txt
    
# extracting locations and counting them
egrep -o -f locpattr cpp-fulltext-201508-ner_clean.txt > cpp-fulltext-201508-ner_loc.txt
cat cpp-fulltext-201508-ner_loc.txt | sed 's/\/LOCATION//g' | sort | uniq -c | sort -nr > all-cpp-fulltext-201508-ner_loc_freq.txt

## CPP201511

stanford-ner/ner.sh cpp-fulltext-201511.txt > cpp-fulltext-201511-ner.txt
sed 's/\/O / /g' < cpp-fulltext-201511-ner.txt > cpp-fulltext-201511-ner_clean.txt
    
# extracting persons and counting them
egrep -o -f personpattr cpp-fulltext-201511-ner_clean.txt > cpp-fulltext-201511_ner_pers.txt
cat cpp-fulltext-201511_ner_pers.txt | sed 's/\/PERSON//g' | sort | uniq -c | sort -nr > cpp-fulltext-201511_ner_pers_freq.txt
    
# extracting organizations and counting them
egrep -o -f orgpattr cpp-fulltext-201511-ner_clean.txt > cpp-fulltext-201511-ner_org.txt
cat cpp-fulltext-201511-ner_org.txt | sed 's/\/ORGANIZATION//g' | sort | uniq -c | sort -nr > cpp-fulltext-201511-ner_org_freq.txt
    
# extracting locations and counting them
egrep -o -f locpattr cpp-fulltext-201511-ner_clean.txt > cpp-fulltext-201511-ner_loc.txt
cat cpp-fulltext-201511-ner_loc.txt | sed 's/\/LOCATION//g' | sort | uniq -c | sort -nr > all-cpp-fulltext-201511-ner_loc_freq.txt

## ELXN42

stanford-ner/ner.sh elxn42-fulltext-201601.txt > elxn42-fulltext-201601-ner.txt
sed 's/\/O / /g' < elxn42-fulltext-201601-ner.txt > elxn42-fulltext-201601-ner_clean.txt
    
# extracting persons and counting them
egrep -o -f personpattr elxn42-fulltext-201601-ner_clean.txt > elxn42-fulltext-201601_ner_pers.txt
cat elxn42-fulltext-201601_ner_pers.txt | sed 's/\/PERSON//g' | sort | uniq -c | sort -nr > elxn42-fulltext-201601_ner_pers_freq.txt
    
# extracting organizations and counting them
egrep -o -f orgpattr elxn42-fulltext-201601-ner_clean.txt > elxn42-fulltext-201601-ner_org.txt
cat elxn42-fulltext-201601-ner_org.txt | sed 's/\/ORGANIZATION//g' | sort | uniq -c | sort -nr > elxn42-fulltext-201601-ner_org_freq.txt
    
# extracting locations and counting them
egrep -o -f locpattr elxn42-fulltext-201601-ner_clean.txt > elxn42-fulltext-201601-ner_loc.txt
cat elxn42-fulltext-201601-ner_loc.txt | sed 's/\/LOCATION//g' | sort | uniq -c | sort -nr > all-elxn42-fulltext-201601-ner_loc_freq.txt