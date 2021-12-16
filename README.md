# bootcamp-devops-groovy
This repository is the result of running the exercises detailed in [00-groovy](https://github.com/Lemoncode/bootcamp-devops-lemoncode/tree/master/03-cd/00-groovy).

## Execute Groovy into Docker containers
Groovy has an official Docker image at https://hub.docker.com/_/groovy/

## Pre Requisites
You need to have Docker installed 

## Groovy Bash 

On Windows Powershell:

```
PS C:\_DevOpsHandsOn\bootcamp-devops-groovy> docker run --rm -it -v /c/_DevOpsHandsOn/bootcamp-devops-groovy:/home/groovy/scripts -w /home/groovy/scripts groovy:latest bash
```
```
groovy@bf0b7f0bc25d:~/scripts$ 
```
Options explained

* --rm automatically delete a Docker container after running it

* -v mounts the local directory bootcamp-devops-groovy (it needs to be an absolute path, /c/_DevOpsHandsOn/bootcamp-devops-groovy) of our computer as a directory of the container (/home/groovy/scripts). In this way we can read or write in it. It doesn’t matter if we remove the container because files are saved in the host directory.  This type of mount is called `bind mount`. If we mount a volume where our script is located, we can execute it into the container.

    To get the absolute path on Windows with Git Bash terminal type pwd

    ```
    LENOVITO@LENOVITO-PC MINGW64 /c/_DevOpsHandsOn/bootcamp-devops-groovy (main)
    $ pwd
    /c/_DevOpsHandsOn/bootcamp-devops-groovy
    ```
    Note that the $(pwd) sub-command expands to the current working directory on Linux or macOS hosts.

* -w sets the working directory inside the container to /home/groovy/scripts.




## Running a Groovy script
Syntax: `groovy <script> <script-args>`

Example to run `BasicDocker.groovy` script:

```
groovy@bf0b7f0bc25d:~/scripts$ groovy BasicDocker.groovy
WARNING: Using incubator modules: jdk.incubator.vector, jdk.incubator.foreign
------------------------------------------------------------------
Hello
PATH=/opt/java/openjdk/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/binGROOVY_VERSION=3.0.9
LANGUAGE=en_US:en
JAVA_HOME=/opt/java/openjdk
TERM=linux
LANG=en_US.UTF-8
GROOVY_HOME=/opt/groovy
GROOVY_APP_NAME=Groovy
HOSTNAME=bf0b7f0bc25d
LC_ALL=en_US.UTF-8
PWD=/home/groovy/scripts
LS_COLORS=rs=0:di=01;34:ln=01;36:mh=00:pi=40;33:so=01;35:do=01;35:bd=40;33;01:cd=40;33;01:or=40;31;01:mi=00:su=37;41:sg=30;43:ca=30;41:tw=30;42:ow=34;42:st=37;44:ex=01;32:*.tar=01;31:*.tgz=01;31:*.arc=01;31:*.arj=01;31:*.taz=01;31:*.lha=01;31:*.lz4=01;31:*.lzh=01;31:*.lzma=01;31:*.tlz=01;31:*.txz=01;31:*.tzo=01;31:*.t7z=01;31:*.zip=01;31:*.z=01;31:*.dz=01;31:*.gz=01;31:*.lrz=01;31:*.lz=01;31:*.lzo=01;31:*.xz=01;31:*.zst=01;31:*.tzst=01;31:*.bz2=01;31:*.bz=01;31:*.tbz=01;31:*.tbz2=01;31:*.tz=01;31:*.deb=01;31:*.rpm=01;31:*.jar=01;31:*.war=01;31:*.ear=01;31:*.sar=01;31:*.rar=01;31:*.alz=01;31:*.ace=01;31:*.zoo=01;31:*.cpio=01;31:*.7z=01;31:*.rz=01;31:*.cab=01;31:*.wim=01;31:*.swm=01;31:*.dwm=01;31:*.esd=01;31:*.jpg=01;35:*.jpeg=01;35:*.mjpg=01;35:*.mjpeg=01;35:*.gif=01;35:*.bmp=01;35:*.pbm=01;35:*.pgm=01;35:*.ppm=01;35:*.tga=01;35:*.xbm=01;35:*.xpm=01;35:*.tif=01;35:*.tiff=01;35:*.png=01;35:*.svg=01;35:*.svgz=01;35:*.mng=01;35:*.pcx=01;35:*.mov=01;35:*.mpg=01;35:*.mpeg=01;35:*.m2v=01;35:*.mkv=01;35:*.webm=01;35:*.ogm=01;35:*.mp4=01;35:*.m4v=01;35:*.mp4v=01;35:*.vob=01;35:*.qt=01;35:*.nuv=01;35:*.wmv=01;35:*.asf=01;35:*.rm=01;35:*.rmvb=01;35:*.flc=01;35:*.avi=01;35:*.fli=01;35:*.flv=01;35:*.gl=01;35:*.dl=01;35:*.xcf=01;35:*.xwd=01;35:*.yuv=01;35:*.cgm=01;35:*.emf=01;35:*.ogv=01;35:*.ogx=01;35:*.aac=00;36:*.au=00;36:*.flac=00;36:*.m4a=00;36:*.mid=00;36:*.midi=00;36:*.mka=00;36:*.mp3=00;36:*.mpc=00;36:*.ogg=00;36:*.ra=00;36:*.wav=00;36:*.oga=00;36:*.opus=00;36:*.spx=00;36:*.xspf=00;36:
JAVA_VERSION=17.0.1
HOME=/home/groovy
SHLVL=1
_=/usr/bin/groovy
------------------------------------------------------------------
```
