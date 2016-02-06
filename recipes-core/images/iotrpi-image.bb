inherit core-image

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

EXTRA_IMAGEDEPENDS += " u-boot"
IMAGE_CLASSES += "uboot-rootfs-img"




