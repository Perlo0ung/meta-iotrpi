require linux.inc

DESCRIPTION = "Mainline Linux Kernel" 
LICENSE = "GPLv2" 
SECTION = "kernel"
COMPATIBLE_MACHINE = "iotrpi"

LINUX_VERSION ?= "4.2.3"
LINUX_VERSION_EXTENSION_append = "-iotrpi"
 
SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${PV}.tar.gz;name=mainline \
           file://defconfig \
"

#PATCH FILES
SRC_URI +="file://9001-Start-GPIO-numeration-at-zero.patch \
           file://9000-Smsc95xx_allow_mac_to_be_set.patch \
"

SRC_URI[mainline.md5sum] = "2cccc90b4bd0eec438cb55696dfcaf65"
SRC_URI[mainline.sha256sum] = "3d6cc528582298a63237f5384723b64983378034b0c6ec848bcdbf814039b45b"

# Set source dir
S = "${WORKDIR}/linux-${PV}"


