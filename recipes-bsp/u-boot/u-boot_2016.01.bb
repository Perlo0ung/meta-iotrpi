DESCRIPTION = "U-Boot Upstream"

require recipes-bsp/u-boot/u-boot.inc

BOOT_SCRIPT_UBOOT = "boot_script.txt"

DEPENDS += "u-boot-mkimage-native"

SRCREV = "fa85e826c16b9ce1ad302a57e9c4b24db0d8b930"

SRC_URI += "file://${BOOT_SCRIPT_UBOOT}"

UBOOT_MACHINE = "rpi_defconfig"
UBOOT_MAKE_TARGET = "u-boot.bin"

COMPATIBLE_MACHINE = "iotrpi"

PV = "v2016.01+git${SRCPV}"

do_compile_append() {
    # Create boot script
    ${STAGING_BINDIR_NATIVE}/uboot-mkimage -C none -A arm -T script -d ${WORKDIR}/${BOOT_SCRIPT_UBOOT} ${DEPLOY_DIR_IMAGE}/boot.scr.uimg
}
