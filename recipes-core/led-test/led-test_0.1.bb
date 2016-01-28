DESCRIPTION = "Simple ledtest application"
SECTION = "base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "busybox gpio-mod"

APP_NAME = "ledtest"

SRC_URI = "file://${APP_NAME}.c"

S = "${WORKDIR}"

do_compile() {
	${CC} ${APP_NAME}.c -o ${APP_NAME}
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${APP_NAME} ${D}${bindir}
}
