DESCRIPTION = "Mainline Linux Kernel" 
LICENSE = "GPLv2" 
SECTION = "kernel"

inherit kernel 
require recipes-kernel/linux/linux-yocto.inc 


LINUX_VERSION ?= "4.2.3"
LINUX_VERSION_EXTENSION_append = "-custom"
 
SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${PV}.tar.gz;name=tarball \
           file://defconfig \
"
#PATCH FILES
SRC_URI +=" "

SRC_URI[tarball.md5sum] = "2cccc90b4bd0eec438cb55696dfcaf65"
SRC_URI[tarball.sha256sum] = "3d6cc528582298a63237f5384723b64983378034b0c6ec848bcdbf814039b45b"

# Set source dir
S = "${WORKDIR}/linux-${PV}"

KCONFIG_MODE="--alldefconfig"

