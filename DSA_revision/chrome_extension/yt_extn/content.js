let isPaused = false;

function handleVisibilityChange() {
  chrome.storage.local.get(['globalPauseEnabled'], (data) => {
    if (!data.globalPauseEnabled) return; // Only run if toggle is ON

    const video = document.querySelector("video");
    if (!video) return;

    if (document.hidden && !video.paused) {
      video.pause();
      isPaused = true;
    } else if (!document.hidden && isPaused) {
      video.play();
      isPaused = false;
    }
  });
}

document.addEventListener("visibilitychange", handleVisibilityChange);
