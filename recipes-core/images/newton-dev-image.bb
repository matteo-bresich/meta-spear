SUMMARY = "Development image"

inherit core-image
require newton-image.bb

IMAGE_FEATURES += "ssh-server-dropbear tools-debug debug-tweaks"

CORE_IMAGE_EXTRA_INSTALL += "newton-packagegroup-testapps"
