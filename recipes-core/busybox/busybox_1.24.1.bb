require busybox_1.24.1.inc

SRC_URI = "http://www.busybox.net/downloads/busybox-${PV}.tar.bz2;name=tarball \
           file://defconfig \
"

SRC_URI[tarball.md5sum] = "be98a40cadf84ce2d6b05fa41a275c6a"
SRC_URI[tarball.sha256sum] = "37d03132cc078937360b392170b7a1d0e5b322eee9f57c0b82292a8b1f0afe3d"
