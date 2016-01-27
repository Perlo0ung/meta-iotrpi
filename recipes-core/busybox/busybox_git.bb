require busybox.inc

SRCREV = "966423d4034067f52b419570a1016d1dfc4aeacd"
# Lookout for PV bump too when SRCREV is changed
PV = "1.25.0+git${SRCPV}"

S = "${WORKDIR}/git"

SRC_URI = "git://busybox.net/busybox.git \
           file://dhcp.script \
"

DEFAULT_PREFERENCE = "-1"

