#get uboot mkimage so we can convert rootfs
DEPENDS += "u-boot-mkimage-native"

IMAGE_POSTPROCESS_COMMAND += " build_uboot_rootfsimage ; "

build_uboot_rootfsimage() {
    #We need to prep the image so that u-boot recognizes it
    ${STAGING_BINDIR_NATIVE}/uboot-mkimage -A arm -O linux -T ramdisk -C none -n "U-Boot RamFS" -d ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.${IMAGE_FSTYPES} \
    ${DEPLOY_DIR_IMAGE}/${IMAGE_NAME}.rootfs.${IMAGE_FSTYPES}.uboot
}
