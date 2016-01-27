DESCRIPTION = "Mainline Linux Kernel 4.2.3" 
LICENSE = "GPLv2" 
 
LIC_FILES_CHKSUM = "file://COPYING;md5=40947352ebe073a1c44fc048ccbcc59d" 
 
inherit kernel 

SRC_URI[kernel.md5sum] = "2cccc90b4bd0eec438cb55696dfcaf65"
SRC_URI[kernel.sha256sum] ="3d6cc528582298a63237f5384723b64983378034b0c6ec848bcdbf814039b45b"



SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.gz;name=kernel \ 
           file://defconfig \
" 

#SRC_URI += "file://yocto-testmod.patch"
