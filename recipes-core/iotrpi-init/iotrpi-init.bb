SUMMARY = "small init script"
DESCRIPTION = "Basic init system for iotrpi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://init \
	  "
S = "${WORKDIR}"

FHS_DIRS = "/bin /boot /dev ${sysconfdir} /lib /media /mnt /opt /run \
           /sbin /srv /tmp /usr /usr/bin /proc /sys /var\
"


do_install() {
	for d in ${FHS_DIRS}; do
		install -m 0755 -d ${D}$d
	done
	install -m 755 ${WORKDIR}/init ${D}
}

FILES_${PN} = "/"
