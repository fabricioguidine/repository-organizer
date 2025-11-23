# Remove .git directories from each pattern folder
$patterns = Get-ChildItem -Path "design-patterns" -Directory

foreach ($pattern in $patterns) {
    $gitDir = Join-Path $pattern.FullName ".git"
    if (Test-Path $gitDir) {
        Write-Host "Removing .git from $($pattern.Name)..."
        Remove-Item -Recurse -Force $gitDir
    }
}

Write-Host "All .git directories removed!"

