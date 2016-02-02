This README file contains information on the contents of the
iotrpi layer.

Please see the corresponding sections below for details.

Maintainer: Michael Offergeld <miofferg@htwg-konstanz.de>

Dependencies
============

This layer depends on:

```
URI: git://git.yoctoproject.org/poky.git
branch: jethro
revision: HEAD
```

Table of Contents
=================

  I. Adding the iotrpi layer to your build
  
 II. Misc


I. Adding the iotrpi layer to your build
=================================================

How to use it:

- ```source oe-init-build-env rpi-build```
- Add needed layer to bblayers.conf: ```meta-iotrpi```
- Changes to be made in local.conf
```
#Set Machnie and distro that will be build
MACHINE = "iotrpi"
DISTRO = "iotrpi"
#GCC 5.2 bug produces non bootable kernelimage 
GCCVERSION = "4.9%"
#User kernel version from iotrpi layer
PREFERRED_PROVIDER_virtual/kernel = "linux-iotrpi"
```
- ```bitbake iotrpi-image```
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


