This README file contains information on the contents of the
iotrpi layer.

Please see the corresponding sections below for details.

Maintainer: Michael Offergeld <miofferg@htwg-konstanz.de>

Dependencies
============

This layer depends on:

```
URI: git://git.yoctoproject.org/poky
branch: master
revision: HEAD

URI: git://git.openembedded.org/meta-openembedded
layers: meta-oe, meta-multimedia
branch: master
revision: HEAD
```

Table of Contents
=================

  I. Adding the iotrpi layer to your build
  
 II. Misc


I. Adding the iotrpi layer to your build
=================================================

How to use it:

- source poky/oe-init-build-env rpi-build
- Add needed layer to bblayers.conf:
    - meta-iotrpi
- Changes to be made in local.conf
```
MACHINE = "iotrpi"
DISTRO = "iotrpi"
GCCVERSION = "4.9%" #GCC 5.2 bug produces non bootable kernelimage 
PREFERRED_PROVIDER_virtual/kernel = "linux-iotrpi"
PREFERRED_VERSION_u-boot = "v2016.01%"
PREFERRED_VERSION_busybox = "1.24.1"
```
- bitbake iotrpi-image
- copy u-boot.bin, bcm2835-rpi-b.dtb, zImage, boot.scr.uimg, rootfs.cpio.uboot to an sdcard
- Boot your RPI, or use Qemu

II. Misc
========

Included:

* Mainline Kernel 4.2.3
* Busybox 1.24.1
* Uboot v2016.01
* Small initramfs rootfs
* GPIO Kernel Driver
* Led blink testprogram for the GPIO driver

This Image will be compiled for Raspberry Pi and Vexpress-A9


