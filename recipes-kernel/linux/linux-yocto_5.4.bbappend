KBRANCH_spear310 = "v5.4/standard/arm-versatile-926ejs"
KMACHINE_spear310 ?= "arm-versatile-926ejs"
SRCREV_machine_spear310 ?= "99743105f331e90852ccb9e72ce26134dbcafec6"
COMPATIBLE_MACHINE_spear310 = "spear310"
LINUX_VERSION_spear310 = "5.4.50"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://defconfig"

