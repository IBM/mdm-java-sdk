#!/usr/bin/env bash
set -x

# This script is responsible for decrypting your encrypted signing key file
# (build/signing.key.enc), and importing it into the gpg keystore.
# This is done so that your maven build will be able to properly sign your jars
# prior to publishing them on maven central.

echo "Importing signing key..."

# Modify the command below to use the correct environment variables
# that were added to your Travis build settings when you encrypted your signing.key file.
#openssl aes-256-cbc -K $encrypted_4c2ca4326cdc_key -iv $encrypted_4c2ca4326cdc_iv -in build/signing.key.enc -out build/signing.key -d
#openssl aes-256-cbc -K $encrypted_4b7d603e7466_key -iv $encrypted_4b7d603e7466_iv -in build/signing.key.enc -out build/signing.key -d
openssl aes-256-cbc -K $encrypted_4c2ca4326cdc_key -iv $encrypted_4c2ca4326cdc_iv -in build/signing.key.enc -out build/signing.key -d
gpg --version
gpg --batch --import build/signing.key
rm build/signing.key

echo "Signing key import finished!"
