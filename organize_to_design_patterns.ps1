# PowerShell script to organize all dcc078 repos into design-patterns structure
$repos = @(
    "dcc078-abstractFactory",
    "dcc078-adapter",
    "dcc078-bridge",
    "dcc078-builder",
    "dcc078-chainOfResponsability",
    "dcc078-command",
    "dcc078-composite",
    "dcc078-decorator",
    "dcc078-facade",
    "dcc078-factoryMethod",
    "dcc078-flyweight",
    "dcc078-interpreter",
    "dcc078-iterator",
    "dcc078-mediator",
    "dcc078-memento",
    "dcc078-observer",
    "dcc078-prototype",
    "dcc078-proxy",
    "dcc078-singleton",
    "dcc078-state",
    "dcc078-strategy",
    "dcc078-templateMethod",
    "dcc078-visitor"
)

# Create design-patterns directory structure
$designPatternsDir = "design-patterns"
if (Test-Path $designPatternsDir) {
    Remove-Item -Recurse -Force $designPatternsDir
}
New-Item -ItemType Directory -Path $designPatternsDir | Out-Null

# Copy each repository's contents to design-patterns
foreach ($repo in $repos) {
    $patternName = $repo -replace "dcc078-", ""
    $sourceDir = "temp_repos\$repo"
    $targetDir = "$designPatternsDir\$patternName"
    
    Write-Host "Organizing $patternName..."
    
    if (Test-Path $sourceDir) {
        # Remove target if exists
        if (Test-Path $targetDir) {
            Remove-Item -Recurse -Force $targetDir
        }
        # Copy the entire repository structure
        Copy-Item -Path $sourceDir -Destination $targetDir -Recurse -Force
    }
}

Write-Host "All patterns organized successfully!"

