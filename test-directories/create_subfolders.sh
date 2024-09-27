for i in {1..100};
do
DIRECTORY_NAME=directory$i
echo "CREATING DIRECTORY $DIRECTORY_NAME"
mkdir $DIRECTORY_NAME
touch file$i.txt
cd $DIRECTORY_NAME
for j in {1..100};
do
SUBDIRECTORY_NAME=subdirectory$j
echo "CREATING SUBDIRECTORY $SUBDIRECTORY_NAME"
mkdir $SUBDIRECTORY_NAME
cd $SUBDIRECTORY_NAME
touch file$j.txt
cd ..
done
cd ..
done
