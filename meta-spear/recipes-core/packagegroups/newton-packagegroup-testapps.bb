DESCRIPTION = "Cerco test application packagegroup"
SUMMARY = "Cerco packagegroup - tools/testapps"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    ethtool \
    i2c-tools \
    memtester \
"
