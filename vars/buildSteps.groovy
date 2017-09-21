// Required constants
BUILT_DIR = 'Built'
ARCHIVE_DIR = '\\\\nirvana\\temp\\dbuck\\testbuild'

def build(lvVersion){
  bat "mkdir $BUILT_DIR"
  bat "copy /Y \"$WORKSPACE\\Jenkinsfile\" \"$BUILT_DIR\\Jenkinsfile\""
  bat "copy /Y \"$WORKSPACE\\Source\\mytest.lvproj.config\" \"$BUILT_DIR\\mytest.lvproj.config\""
}

//This function should be a no-op until we can use a toolchain version of LV
//This is intended to be used to copy files into LV in an arbitrary location (i.e. not through an installer)
//on the build machine. We can't do that now, but don't want to have to update the pipeline
//and every single add-on to have this function once we have that capability
def setupLv(lvVersion){
  noop()
}

def prepareSource(lvVersion){
  copyProjectConfig("Source/mytest.lvproj", lvVersion)
}

def syncDependencies(){
  noop()
}

def codegen(lvVersion){
  noop()
}

//this is required for dynamic loading of this file
return this;
