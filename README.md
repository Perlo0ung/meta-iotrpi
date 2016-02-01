This README file contains information on the contents of the
iotrpi layer.

Please see the corresponding sections below for details.

Maintainer: Michael Offergeld <miofferg@htwg-konstanz.de>

Dependencies
============

This layer depends on:

  URI: git://git.openembedded.org/bitbake
  branch: master

  URI: git://git.openembedded.org/openembedded-core
  layers: meta
  branch: master




Table of Contents
=================

  I. Adding the iotrpi layer to your build
 II. Misc


I. Adding the iotrpi layer to your build
=================================================

--- replace with specific instructions for the iotrpi layer ---

In order to use this layer, you need to make the build system aware of
it.

Assuming the iotrpi layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the iotrpi layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-yocto \
    /path/to/yocto/meta-iotrpi \
    "


II. Misc
========

--- replace with specific information about the iotrpi layer ---
