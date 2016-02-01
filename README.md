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

Changes to be made in local.conf

```
MACHINE = "iotrpi"
DISTRO = "iotrpi"
GCCVERSION = "4.9%" #GCC 5.2 bug produces non bootable kernelimage 
PREFERRED_PROVIDER_virtual/kernel = "linux-iotrpi"
PREFERRED_VERSION_u-boot = "v2016.01%"
PREFERRED_VERSION_busybox = "1.24.1"
```

In order to use this layer, you need to make the build system aware of
it.

Assuming the iotrpi layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the iotrpi layer to bblayers.conf, along with any
other layers needed. e.g.:
```
  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-yocto \
    /path/to/yocto/meta-iotrpi \
    "
```
To build:

```bitbake iotrpi-image```

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


