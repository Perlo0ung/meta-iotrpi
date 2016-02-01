DESCRIPTION = "A minimal console image that supports the iotrpi"


#base-files 
IMAGE_INSTALL = " \
		busybox \
		iotrpi-init \
		${ROOTFS_PKGMANAGE_BOOTSTRAP} \
		${CORE_IMAGE_EXTRA_INSTALL} \
		gpio-mod \
		led-test \
"

IMAGE_LINGUAS = " "

IMAGE_CLASSES += "uboot-rootfs-img"

LICENSE = "MIT"

inherit core-image



