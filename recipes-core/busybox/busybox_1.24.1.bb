LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de10de48642ab74318e893a61105afbb"

SECTION = "base"

SRC_URI = "http://www.busybox.net/downloads/busybox-${PV}.tar.bz2;name=tarball \
           file://defconfig \
"

SRC_URI[tarball.md5sum] = "be98a40cadf84ce2d6b05fa41a275c6a"
SRC_URI[tarball.sha256sum] = "37d03132cc078937360b392170b7a1d0e5b322eee9f57c0b82292a8b1f0afe3d"

# We don't want '-e MAKEFLAGS=' in EXTRA_OEMAKE
EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} SKIP_STRIP=y"

do_configure () {
	cat ${WORKDIR}/defconfig > ${S}/.config
}


do_install () {
	install -d ${D}${base_bindir}
	install -m 755 ${B}/busybox ${D}${base_bindir}
	#setup link for /bin/sh so QA stage passes
	ln -sf busybox ${D}${base_bindir}/sh
}

python do_menuconfig () {
        oe_terminal("${SHELL} -c \"make menuconfig; if [ \$? -ne 0 ]; then echo 'Command failed.'; printf 'Press any key to continue... '; read r; fi\"", '${PN} Configuration', d)
}

addtask menuconfig
