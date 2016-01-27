DESCRIPTION = "Mainline Linux Kernel 4.2.3" 
LICENSE = "GPLv2" 
 
LIC_FILES_CHKSUM = "file://COPYING;md5=2cccc90b4bd0eec438cb55696dfcaf65" 
 
inherit kernel 

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-4.2.4.tar.gz; \ 
 file://defconfig" 

#SRC_URI += "file://yocto-testmod.patch"
