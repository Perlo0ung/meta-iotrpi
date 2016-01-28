SUMMARY = "small init script"
DESCRIPTION = "Basic init system for iotrpi"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://init \
	  "

S = "${WORKDIR}"

do_install() {
	install -m 755 ${WORKDIR}/init ${D}
}

FILES_${PN} = "init"
