#!/usr/bin/env bash

javap -verbose Main > Main.bytecode

javap -verbose 'Main$Box.class' > 'Main$Box.bytecode'