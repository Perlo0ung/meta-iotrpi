DESCRIPTION = "Mainline Linux Kernel 4.2.3" 
LICENSE = "GPLv2" 
 
LIC_FILES_CHKSUM = "file://COPYING;md5=2cccc90b4bd0eec438cb55696dfcaf65" 
 
inherit kernel 

SRC_URI[md5sum] = "042a3047d48012364eff19f836e98ae0"
SRC_URI[sha256sum] = "f388cda2a0bc462c456afbb065991b17c01998dff6be3acddf1e28e3600c8693"


SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-4.2.4.tar.gz; \ 
 file://defconfig" 

#SRC_URI += "file://yocto-testmod.patch"
