# Problem 1: Read the instructions carefully and answer accordingly. If there is any need to insert some data then do that as well.
## a) Navigate and List:
### a. Start by navigating to your home directory and list its contents. Then, move into adirectory named "LinuxAssignment" if it exists; otherwise, create it.

```bash
harsh@LAPTOP-D29L2GVE:/$ pwd
/
harsh@LAPTOP-D29L2GVE:/$ ls
bin         srv        wslHPepfi  wslaoPiFP  wsljDKckB
boot        sys        wslIMCHBh  wslbEoGBB  wsljcGBkp
dev         tmp        wslJDlEIN  wslcKMFMd  wsljdcGmp
etc         usr        wslJEHcKd  wslcLEAjn  wsljkGKIN
home        var        wslJpiPFd  wslcadGmo  wsljlPDNp
init        wslAFoEec  wslKMNjCN  wslchnIpm  wsljmhbao
lib         wslAlhIOi  wslKOplPC  wslclPOIp  wslkamkjk
lib32       wslBbBNbo  wslKccjMg  wsldlkFOh  wsllFcdbp
lib64       wslBnOJKI  wslLENCMc  wslehMnBe  wsllaEnKD
libx32      wslBpCfoa  wslLKiKlO  wslejHKkc  wsllkAaFD
lost+found  wslCEbEhf  wslLdLHNi  wslfKoAMo  wslmCEHjL
media       wslCNmFkM  wslLeiFMe  wslfOfBpB  wslmfjfff
mnt         wslCaIbke  wslLhCHkG  wslfOjjBa  wslnAgbdf
opt         wslDadlpc  wslMgiokp  wslgKBpHK  wsloKNaDp
proc        wslDhCDlh  wslOaOgdK  wslgfOnEa  wsloMMHLI
root        wslDhcFli  wslOmPNmk  wslhNCcfh  wslooICBO
run         wslDmLnlK  wslPIoDkk  wsliEaJmC  wslpOHojm
sbin        wslFnPApC  wslPLFaCA  wsliPaIbd  wslpPgLBO
snap        wslHEKNjh  wslaIabgC  wsliePAkE
```

## b) File Management:
### a. Inside the "LinuxAssignment" directory, create a new file named "file1.txt". Display its contents.


```shell
harsh@LAPTOP-D29L2GVE:~$ mkdir LinuxAssignment

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ touch file1.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
file1.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat > file1.txt
hello
I am Tejas
I am from Nashik
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ read file1.txt
-bash: read: `file1.txt': not a valid identifier
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat file1.txt
hello
I am Tejas
I am from Nashik
```

## c) Directory Management:
### a. Create a new directory named "docs" inside the "LinuxAssignment" directory.

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ mkdir docs
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  file1.txt

```

## d) Copy and Move Files:
### a. Copy the "file1.txt" file into the "docs" directory and rename it to "file2.txt".

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ mv file1.txt docs/file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cd docs/
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls
file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ cat file2.txt
hello
I am Tejas
I am from Nashik

```

## e) Permissions and Ownership:
### a. Change the permissions of "file2.txt" to allow read, write, and execute permissions for the wner and only read permissions for others. Then, change the owner of "file2.txt" to the current user.

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls -l
total 4
-rw-r--r-- 1 harsh harsh 34 Aug 28 18:05 file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ chmod u+rwx file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls -l
total 4
-rwxr--r-- 1 harsh harsh 34 Aug 28 18:05 file2.txt

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ sudo adduser virat
[sudo] password for harsh:
Adding user `virat' ...
Adding new group `virat' (1002) ...
Adding new user `virat' (1002) with group `virat' ...
Creating home directory `/home/virat' ...
Copying files from `/etc/skel' ...
New password:
Retype new password:
passwd: password updated successfully
Changing the user information for virat
Enter the new value, or press ENTER for the default
        Full Name []: virat
        Room Number []: 18
        Work Phone []: 1234567
        Home Phone []: 7654321
        Other []:
Is the information correct? [Y/n] y
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls -l
total 4
-rwxr--r-- 1 harsh harsh 34 Aug 28 18:05 file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ sudo chown virat file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls -l
total 4
-rwxr--r-- 1 virat harsh 34 Aug 28 18:05 file2.txt

```

### f) Final Checklist:
## a. Finally, list the contents of the "LinuxAssignment" directory and the root directory to ensure that all operations were performed correctly. 

```bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls -R
.:
docs

./docs:
file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls -Rl
.:
total 4
drwxr-xr-x 2 harsh harsh 4096 Aug 28 18:07 docs

./docs:
total 4
-rwxr--r-- 1 virat harsh 34 Aug 28 18:05 file2.txt
```

## g) File Searching:
### a. Search for all files with the extension ".txt" in the current directory and its subdirectories.

```bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cd docs/
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls
file2.txt

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls -R | grep '\.txt'
xyz.txt
file2.txt


```

### b. Display lines containing a specific word in a file (provide a file name and the specific word to search).

```bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ cat file2.txt
hello
I am Tejas
I am from Nashik

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ls
file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ grep 'Tejas' file2.txt
I am Tejas

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ grep -l 'Tejas' file2.txt
file2.txt

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ grep 'Tejas' -l file2.txt
file2.txt

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ grep 'Tejas' -o file2.txt
Tejas

```


## h) System Information:
### a. Display the current system date and time.

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ date
Wed Aug 28 18:36:18 IST 2024
```

## i) Networking:
### a. Display the IP address of the system.

```bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ hostname
LAPTOP-D29L2GVE

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ip addr
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host
       valid_lft forever preferred_lft forever
2: bond0: <BROADCAST,MULTICAST,MASTER> mtu 1500 qdisc noop state DOWN group default qlen 1000
    link/ether 72:0a:b1:ad:72:c8 brd ff:ff:ff:ff:ff:ff
3: dummy0: <BROADCAST,NOARP> mtu 1500 qdisc noop state DOWN group default qlen 1000
    link/ether e2:b7:2c:d6:ab:ef brd ff:ff:ff:ff:ff:ff
4: tunl0@NONE: <NOARP> mtu 1480 qdisc noop state DOWN group default qlen 1000
    link/ipip 0.0.0.0 brd 0.0.0.0
5: sit0@NONE: <NOARP> mtu 1480 qdisc noop state DOWN group default qlen 1000
    link/sit 0.0.0.0 brd 0.0.0.0
6: eth0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
    link/ether 00:15:5d:d4:5f:dc brd ff:ff:ff:ff:ff:ff
    inet 172.29.203.24/20 brd 172.29.207.255 scope global eth0
       valid_lft forever preferred_lft forever
    inet6 fe80::215:5dff:fed4:5fdc/64 scope link
       valid_lft forever preferred_lft forever


harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ip

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/docs$ ipconfig


```


### b. Ping a remote server to check connectivity (provide a remote server address to ping).

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ping google.com
PING google.com (142.250.70.78) 56(84) bytes of data.
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=1 ttl=53 time=46.4 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=3 ttl=53 time=48.6 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=4 ttl=53 time=46.9 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=6 ttl=53 time=241 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=7 ttl=53 time=47.0 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=8 ttl=53 time=259 ms
64 bytes from pnbomb-ab-in-f14.1e100.net (142.250.70.78): icmp_seq=9 ttl=53 time=427 ms
^C
--- google.com ping statistics ---
9 packets transmitted, 7 received, 22.2222% packet loss, time 8049ms
rtt min/avg/max/mdev = 46.440/159.314/426.511/140.522 ms
```


## j) File Compression:
### a. Compress the "docs" directory into a zip file.

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  new  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ zip docs new

Command 'zip' not found, but can be installed with:

sudo apt install zip

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ man zip
No manual entry for zip
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sudo apt install zip
[sudo] password for harsh:
Reading package lists... Done
Building dependency tree
Reading state information... Done
The following additional packages will be installed:
  unzip
The following NEW packages will be installed:
  unzip zip
0 upgraded, 2 newly installed, 0 to remove and 269 not upgraded.
Need to get 336 kB of archives.
After this operation, 1231 kB of additional disk space will be used.
Do you want to continue? [Y/n] y
Get:1 http://archive.ubuntu.com/ubuntu focal-updates/main amd64 unzip amd64 6.0-25ubuntu1.2 [169 kB]
Get:2 http://archive.ubuntu.com/ubuntu focal/main amd64 zip amd64 3.0-11build1 [167 kB]
Fetched 336 kB in 3s (126 kB/s)
Selecting previously unselected package unzip.
(Reading database ... 64433 files and directories currently installed.)
Preparing to unpack .../unzip_6.0-25ubuntu1.2_amd64.deb ...
Unpacking unzip (6.0-25ubuntu1.2) ...
Selecting previously unselected package zip.
Preparing to unpack .../zip_3.0-11build1_amd64.deb ...
Unpacking zip (3.0-11build1) ...
Setting up unzip (6.0-25ubuntu1.2) ...
Setting up zip (3.0-11build1) ...
Processing triggers for man-db (2.9.1-1) ...
Processing triggers for mime-support (3.64ubuntu1) ...
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ man zip
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  new  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ zip docs new
  adding: new/ (stored 0%)
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  docs.zip  new  xyz.txt

```

### b. Extract the contents of the zip file into a new directory.

```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ unzip docs.zip -d ./folder
Archive:  docs.zip
   creating: ./folder/docs/
  inflating: ./folder/docs/file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  docs.zip  folder  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cd folder/
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/folder$ ls
docs
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/folder$ cd docs/
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/folder/docs$ ls
file2.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment/folder/docs$ ls
file2.txt


harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ unzip -l docs.zip
Archive:  docs.zip
  Length      Date    Time    Name
---------  ---------- -----   ----
        0  2024-08-28 18:07   docs/
       34  2024-08-28 18:05   docs/file2.txt
---------                     -------
       34                     2 files

```

## k) File Editing:
### a. Open the "file1.txt" file in a text editor and add some text to it.
```bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ nano file1.txt
```
### b. Replace a specific word in the "file1.txt" file with another word (provide the original word and the word to replace it with). 

```bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat file1.txt
abc
def
ghi
jkl

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sed -i 's/abc/tejas/g' file1.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat file1.txt
tejas
def
ghi
jkl

```

# Problem 2: Read the instructions carefully and answer accordingly. If there is any need to insert some data then do that as well.
## a. Suppose you have a file named "data.txt" containing important information. Display the first 10 lines of this file to quickly glance at its contents using a command.

``` bash

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
docs  docs.zip  file1.txt  folder  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat > data.txt
a
b
c
d
e
f
g
h
j
k
l
m
n
o
p
q
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
data.txt  docs  docs.zip  file1.txt  folder  xyz.txt

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ head -10 data.txt
a
b
c
d
e
f
g
h
j
k

```

## b. Now, to check the end of the file for any recent additions, display the last 5 lines of "data.txt" using another command.


``` bash



harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ tail -5 data.txt
m
n
o
p


```





## c. In a file named "numbers.txt," there are a series of numbers. Display the first 15 lines of this file to analyze the initial data set.


``` bash

qharsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat > numbers.txt
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat numbers.txt
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
data.txt  docs  docs.zip  file1.txt  folder  numbers.txt  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ ls
data.txt  docs  docs.zip  file1.txt  folder  numbers.txt  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat numbers.txt
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

```

## d. To focus on the last few numbers of the dataset, display the last 3 lines of "numbers.txt".


``` bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ tail -3 numbers.txt
18
19
20


harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat numbers.txt
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ man sort
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sort -r numbers.txt
9
8
7
6
5
4
3
20
2
19
18
17
16
15
14
13
12
11
10
1
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat numbers.txt
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

## e. Imagine you have a file named "input.txt" with text content. Use a command to translate all lowercase letters to uppercase in "input.txt" and save the modified text in a new file named "output.txt."


``` bash
20harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat > input.txt
tejas
katkade
cdac mumbai
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat input.txt
tejas
katkade
cdac mumbai

data.txt  docs  docs.zip  file1.txt  folder  input.txt  numbers.txt  xyz.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ tr '[:lower:]' '[:upper:]' <input.txt> output.txt
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat output.txt
TEJAS
KATKADE
CDAC MUMBAI


```


## f. In a file named "duplicate.txt," there are several lines of text, some of which are duplicates. Use a command to display only the unique lines from "duplicate.txt."


``` bash


harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat > duplicat.txt
tejas
tejas
cdac
mumbai
cdac

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ uniq -D duplicat.txt
tejas
tejas

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sort duplicat.txt | uniq -D duplicat.txt
tejas
tejas

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sort duplicat.txt
cdac
cdac
mumbai
tejas
tejas

harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sort duplicat.txt | uniq
cdac
mumbai
tejas

```


## g. In a file named "fruit.txt," there is a list of fruits, but some fruits are repeated. Use a command to display each unique fruit along with the count of its occurrences in "fruit.txt." 


``` bash
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat >fruit.txt
apple
mango
jackfruit
mango
apple
banana
papaya
papaya
watermelon
watermelon
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ cat fruit.txt
apple
mango
jackfruit
mango
apple
banana
papaya
papaya
watermelon
watermelon
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$ sort fruit.txt | uniq -c
      2 apple
      1 banana
      1 jackfruit
      2 mango
      2 papaya
      2 watermelon
harsh@LAPTOP-D29L2GVE:~/LinuxAssignment$

```

