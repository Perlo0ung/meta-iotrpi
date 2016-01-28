LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de10de48642ab74318e893a61105afbb"

SECTION = "base"

# We don't want '-e MAKEFLAGS=' in EXTRA_OEMAKE
EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} SKIP_STRIP=y"

do_configure () {
	cat ${WORKDIR}/defconfig > ${S}/.config
}


do_install () {
	install -d ${D}${base_bindir}
	install -m 755 ${B}/busybox ${D}${base_bindir}
	ln -sf busybox ${D}${base_bindir}/sh
}
