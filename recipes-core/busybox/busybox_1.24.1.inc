LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de10de48642ab74318e893a61105afbb"

SECTION = "base"

export EXTRA_CFLAGS = "${CFLAGS}"
export EXTRA_LDFLAGS = "${LDFLAGS}"

# We don't want '-e MAKEFLAGS=' in EXTRA_OEMAKE
EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} SKIP_STRIP=y"

PACKAGES =+ "${PN}-httpd ${PN}-udhcpd ${PN}-udhcpc ${PN}-syslog ${PN}-mdev ${PN}-hwclock"

do_install () {
    install -m 755 ${WORKDIR}/dhcp.script ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/inittab ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/passwd ${D}${sysconfdir}
	install -m 644 ${WORKDIR}/profile ${D}${sysconfdir}
}

do_configure () {
	cat ${WORKDIR}/defconfig > ${S}/.config
}
