DESCRIPTION = "A minimal console image that supports the iotrpi"

IMAGE_INSTALL = " \
		base-files \
		busybox \
		iotrpi-init \
		${ROOTFS_PKGMANAGE_BOOTSTRAP} \
		${CORE_IMAGE_EXTRA_INSTALL} \
"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"
